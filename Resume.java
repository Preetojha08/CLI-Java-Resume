public class Resume {

    public static void main(String[] args) {
        // Personal Information
        String name;
        String address;
        String phone;
        String email;
        String linkedIn;

        // Objective
        String objective;

        // Skills
        String[] skills;

        // Education
        String education;

        // Certifications
        String[] certifications;

        // Experience
        String[] experience;

        // Volunteer Work
        String volunteer;

        // Awards
        String[] awards;

        // Display Resume
        System.out.println("===== Resume =====\n");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("LinkedIn: " + linkedIn);

        System.out.println("\nObjective:\n" + objective);

        System.out.println("\nSkills:");
        for (String skill : skills) {
            System.out.println(" - " + skill);
        }

        System.out.println("\nEducation:\n" + education);

        System.out.println("\nCertifications:");
        for (String certification : certifications) {
            System.out.println(" - " + certification);
        }

        System.out.println("\nExperience:");
        for (String exp : experience) {
            System.out.println(" - " + exp);
        }

        System.out.println("\nVolunteer Work:\n" + volunteer);

        System.out.println("\nAwards:");
        for (String award : awards) {
            System.out.println(" - " + award);
        }
    }
}
