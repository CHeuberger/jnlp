package cfh.test.jnlp;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.nio.file.Files;
import java.util.List;
import java.util.prefs.Preferences;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Main {

    public static final String PREF_DIR = "directory";
    private static final Preferences prefs = Preferences.userNodeForPackage(Main.class);
    
    
    public static void main(String[] args) {
        try {
            System.out.println("started");

            JOptionPane.showMessageDialog(null, "started");

            String dir = prefs.get(PREF_DIR, ".");

            JFileChooser chooser = new JFileChooser(dir);
            chooser.setAcceptAllFileFilterUsed(true);
            chooser.setFileFilter(new FileNameExtensionFilter("text files", "txt"));
            chooser.setFileSelectionMode(chooser.FILES_ONLY);
            chooser.setMultiSelectionEnabled(false);
            if (chooser.showOpenDialog(null) != chooser.APPROVE_OPTION)
                return;

            dir = chooser.getCurrentDirectory().getAbsolutePath();
            prefs.put(PREF_DIR, dir);
            List<String> lines = Files.readAllLines(chooser.getSelectedFile().toPath());

            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection selection = new StringSelection(lines.get(0));
            clipboard.setContents(selection, selection);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
