
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Photo_Quiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		String bob = "http://orig02.deviantart.net/4df7/f/2012/055/d/4/wave_controller_by_thepowha-d4qsdiv.png";
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image URL”)

		// 2. create a variable of type "Component" that will hold your image
		Component imageholder;
		// 3. use the "createImage()" method below to initialize your Component

		imageholder = createImage(bob);
		// 4. add the image to the quiz window
		quizWindow.add(imageholder);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String person = JOptionPane.showInputDialog("Who is this person");
		// 7. print "CORRECT" if the user gave the right answer
		if (person.equalsIgnoreCase("Jue Viole Grace")) {
			// 8. print "INCORRECT" if the answer is wrong
			JOptionPane.showMessageDialog(null, "CORRECT");
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(imageholder);
		// 10. find another image and create it (might take more than one line
		// of code)
		String john = "https://68.media.tumblr.com/620bd08a7ea4932027bff97fa5a77421/tumblr_inline_o4tx7jvzyh1sbpryj_540.jpg";
		Component imageholder2;
		imageholder2 = createImage(john);
		// 11. add the second image to the quiz window
		quizWindow.add(imageholder2);
		// 12. pack the quiz window
		quizWindow.pack();

		// 13. ask another question
		String qwert = JOptionPane.showInputDialog("Who is this great leader");
		// 14+ check answer, say if correct or incorrect, etc.
		if (qwert.equalsIgnoreCase("RAK")) {
			// 8. print "INCORRECT" if the answer is wrong
			JOptionPane.showMessageDialog(null, "CORRECT");
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
