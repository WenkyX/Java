import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MlogCodeLabeler {
    private JTextArea file;
    private JTextArea output;
    private JLabel error;

    public MlogCodeLabeler() {
        JFrame root = new JFrame("Mlog code labler");
        root.setSize(800, 500);
        root.setResizable(false);
        root.getContentPane().setBackground(new Color(50, 55, 64));
        root.setLayout(null);

        file = new JTextArea();
        file.setBounds(50, 50, 300, 300);
        root.add(file);

        output = new JTextArea();
        output.setBounds(400, 50, 300, 300);
        root.add(output);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(200, 400, 100, 30);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitText();
            }
        });
        root.add(submitButton);

        JButton copyButton = new JButton("Copy!");
        copyButton.setBounds(600, 400, 100, 30);
        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copy();
            }
        });
        root.add(copyButton);

        error = new JLabel("");
        error.setBackground(new Color(50, 55, 64));
        error.setForeground(Color.WHITE);
        error.setFont(new Font("Arial", Font.PLAIN, 12));
        error.setBounds(300, 400, 300, 30);
        root.add(error);

        JLabel inputLabel = new JLabel("Input");
        inputLabel.setBackground(new Color(50, 55, 64));
        inputLabel.setForeground(Color.WHITE);
        inputLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        inputLabel.setBounds(80, 20, 100, 30);
        root.add(inputLabel);

        JLabel outputLabel = new JLabel("Output");
        outputLabel.setBackground(new Color(50, 55, 64));
        outputLabel.setForeground(Color.WHITE);
        outputLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        outputLabel.setBounds(400, 20, 100, 30);
        root.add(outputLabel);

        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        root.setVisible(true);
    }

    private void submitText() {
        String mcode = file.getText();
        if (!mcode.isEmpty()) {
            String[] lines = mcode.split("\n");
            List<Integer> jumpList = new ArrayList<>();
            StringBuilder lmcode = new StringBuilder();

            for (int i = 0; i < lines.length; i++) {
                String lineText = lines[i].trim();
                if (!lineText.isEmpty()) {
                    String firstWord = lineText.split(" ")[0];
                    if (firstWord.equals("jump")) {
                        int secondWord = Integer.parseInt(lineText.split(" ")[1]);
                        jumpList.add(secondWord);
                    }
                }
            }

            for (int i = 0; i < lines.length; i++) {
                String lineText = lines[i].trim();
                if (!lineText.isEmpty()) {
                    String firstWord = lineText.split(" ")[0];
                    if (firstWord.equals("jump")) {
                        String[] words = lineText.split(" ");
                        for (int ii = 0; ii < words.length; ii++) {
                            if (ii == 1) {
                                lmcode.append("j").append(words[ii]).append(" ");
                            } else {
                                lmcode.append(words[ii]).append(" ");
                            }
                        }
                        lmcode.append("\n");
                    } else {
                        lmcode.append("    ").append(lineText).append("\n");
                    }
                }
                if (jumpList.contains(i)) {
                    lmcode.append("j").append(i).append(":\n");
                }
            }
            System.out.println(jumpList);
            output.setText(lmcode.toString());
        } else {
            error.setText("please enter an mlog code");
        }
    }

    private void copy() {
        String lmcode = output.getText();
        StringSelection stringSelection = new StringSelection(lmcode);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    public static void main(String[] args) {
        new MlogCodeLabeler();
    }
}

