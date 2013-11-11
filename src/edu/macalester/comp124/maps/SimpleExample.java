package edu.macalester.comp124.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Shilad Sen
 */
public class SimpleExample {
    public static void main(String args[]) {
        Map<String, Integer> counts = new HashMap<String, Integer>();
        for (String word : MISSION.toLowerCase().split("[^a-zA-Z]+")) {
//            counts.put(word, (counts.containsKey(word) ? counts.get(word) : 0) + 1);
            if (counts.containsKey(word)) {
                counts.put(word, counts.get(word) + 1);
            } else {
                counts.put(word, 1);
            }
        }

        for (String word : counts.keySet()) {
            System.out.println(word + " = " + counts.get(word));
        }
    }

    public static String MISSION = "Macalester is committed to being a preeminent liberal arts college with an educational program known for its high standards for scholarship and its special emphasis on internationalism, multiculturalism, and service to society.\n" +
            "\n" +
            "Statement of Purpose and Belief\n" +
            "\n" +
            "At Macalester College we believe that education is a fundamentally transforming experience. As a community of learners, the possibilities for this personal, social, and intellectual transformation extend to us all. We affirm the importance of the intellectual growth of the students, staff and faculty through individual and collaborative endeavor. We believe that this can best be achieved through an environment that values the diverse cultures of our world and recognizes our responsibility to provide a supportive and respectful environment for students, staff and faculty of all cultures and backgrounds.\n" +
            "\n" +
            "We expect students to develop a broad understanding of the liberal arts while they are at Macalester. Students should follow a primary course of study in order to acquire an understanding of disciplinary theory and methodology; they should be able to apply their understanding of theories to address problems in the larger community. Students should develop the ability to use information and communication resources effectively, be adept at critical, analytical and logical thinking, and express themselves well in both oral and written forms. Finally, students should be prepared to take responsibility for their personal, social and intellectual choices.\n" +
            "\n" +
            "We believe that the benefit of the educational exp erience at Macalester is the development of individuals who make informed judgments and interpretations of the broader world around them and choose actions or beliefs for which they are willing to be held accountable. We expect them to develop the ability to seek and use knowledge and experience in contexts that challenge and inform their suppositions about the world. We are committed to helping students grow intellectually and personally within an environment that models and promotes academic excellence and ethical behavior. The education a student begins at Macalester provides the basis for continuous transformation through learning and service.";
}
