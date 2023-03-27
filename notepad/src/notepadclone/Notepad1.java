package notepadclone;
import javax.swing.*;

public class Notepad1 {
	
	NotepadDemo1(){
	
	JFrame f= new JFrame("NotepadDemo");
	JMenuBar jb= new JMenuBar();
	JMenu jm1 = new JMenu("File");
	JMenu jm2 = new JMenu("Edit");
	JMenu jm3 = new JMenu("view");
	JMenu jm4 = new JMenu("Help");
	
	JMenuItem m1 = new JMenuItem("New");
	JMenuItem m2 = new JMenuItem("New Window");
	JMenuItem m3 = new JMenuItem("Open");
	JMenuItem m4 = new JMenuItem("Save");
	JMenuItem m5 = new JMenuItem("Save As");
	JMenuItem m6 = new JMenuItem("Page SetUp");
	JMenuItem m7 = new JMenuItem("Print");
	JMenuItem m8 = new JMenuItem("Exit");
	JMenuItem m9 = new JMenuItem("Undo");
	JMenuItem m10 = new JMenuItem("Cut");
	JMenuItem m11= new JMenuItem("Copy");
	JMenuItem m12= new JMenuItem("Paste");
	JMenuItem m13 = new JMenuItem("Delete");
	JMenuItem m14= new JMenuItem("Find");
	JMenuItem m15= new JMenuItem("Find Next");
	JMenuItem m16= new JMenuItem("Find Previous");
	JMenuItem m17= new JMenuItem("Replace");
	JMenuItem m18= new JMenuItem("Go To");
	JMenuItem m19= new JMenuItem("Select All");
	JMenuItem m20= new JMenuItem("Time/Date");
	JMenuItem m21= new JMenuItem("Font");
	JMenuItem m22 = new JMenuItem("Zoom");
	JMenuItem m23= new JMenuItem("StatusBar");
	JMenuItem m24= new JMenuItem("WordWrap");
	
	jb.add(jm1);
	jb.add(jm2);
	jb.add(jm3);
	jb.add(jm4);
	
	jm1.add(m1);
	jm1.add(m2);
	jm1.add(m3);
	jm1.add(m4);
	jm1.add(m5);
	jm1.add(m6);
	jm1.add(m7);
	jm1.add(m8);
	jm2.add(m9);
	jm2.add(m10);
	jm2.add(m11);
	jm2.add(m12);
	jm2.add(m13);
	jm2.add(m14);
	jm2.add(m15);
	jm2.add(m16);
	jm2.add(m17);
	jm2.add(m18);
	jm2.add(m19);
	jm2.add(m20);
	jm2.add(m21);
	jm3.add(m22);
	jm3.add(m23);
	jm3.add(m24);
	


	f.setJMenuBar(jb);
	f.setSize(400, 400);
	f.setLayout(null);
	f.setVisible(true);
	
	}
	public static void main(String[] args) {
		new NotepadDemo1();
		// TODO Auto-generated method stub

	}

}

