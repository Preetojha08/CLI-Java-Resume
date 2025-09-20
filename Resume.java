public class Resume {

    public static void main(String[] args) {
        // Personal Information
        String name = "Preet Ojha";
        String address = "Toronto, ON";
        String phone = "437-808-2062";
        String email = "developer.preetojha08@gmail.com";
        String linkedIn = "https://www.linkedin.com/in/developer-preet-ojha/";
        
        // Objective
        String objective = "Motivated Software Developer with expertise in Android, Cloud, and Full Stack Development. "
                + "Currently pursuing a Postgraduate Diploma in Full Stack Software Development at Lambton College, "
                + "seeking a Winter 2025 internship at TD Insurance to contribute to innovative solutions and enhance customer experiences.";

        // Skills
        String[] skills = {
            "Programming: Java, Kotlin, C++, Python, JavaScript, SQL, PHP",
            "Development: Android SDK/NDK, Web Development, Full Stack Development",
            "Tools: Firebase, MySQL, VS Code, Android Studio, Gradle, Maven, Docker, Kubernetes",
            "Frameworks: Retrofit, Room DB, ReactJS, Node.js, ExpressJS, .NET, Jetpack Compose",
            "Collaboration: Git, GitHub, GitLab, Agile (Scrum, Kanban)",
            "Cloud: AWS, Google GCP, Azure, Heroku"
        };

        // Education
        String[] education = {
            "Postgraduate Diploma in Full Stack Software Development, Lambton College (Sept 2023 – Apr 2025)",
            "Bachelor’s in Computer Engineering, Gujarat Technology University (Aug 2019 – Jun 2022) | GPA: 3.4/4.0"
        };

        // Certifications
        String[] certifications = {
            "Cambridge Certification Authority – Java Level 1",
            "Web Development Programming Foundations – Duke University (Coursera)",
            "Android App Development – Vanderbilt University (Coursera)"
        };

        // Experience
        String[] experience = {
            "Sandwich Artist | Subway Sandwich, Eglinton, Canada (Sept 2023 – Present)",
            "Junior Software Developer | Cronic Technologies (Jan 2022 – Jun 2022)",
            "Junior Android Developer | Silverwing Technologies Pvt Ltd (Apr 2018 – Apr 2019)"
        };

        // Volunteer Work
        String[] volunteer = {
            "Food Distribution Volunteer | FRIENDS, Gujarat, India (Nov 2020 – Dec 2020)"
        };

        // Awards
        String[] awards = {
            "Google Android Study Jam Winner (2021)",
            "Best Technical Presentation – Gujarat Technology University (2022)"
        };

        // Display Resume
        printHeader("RESUME");
        printLine("Name", name);
        printLine("Address", address);
        printLine("Phone", phone);
        printLine("Email", email);
        printLine("LinkedIn", linkedIn);

        printHeader("Objective");
        System.out.println(objective);

        printHeader("Skills");
        printList(skills);

        printHeader("Education");
        printList(education);

        printHeader("Certifications");
        printList(certifications);

        printHeader("Experience");
        printList(experience);

        printHeader("Volunteer Work");
        printList(volunteer);

        printHeader("Awards");
        printList(awards);
    }

    // Helper methods for cleaner code
    private static void printHeader(String title) {
        System.out.println("\n=== " + title.toUpperCase() + " ===");
    }

    private static void printLine(String label, String value) {
        System.out.println(label + ": " + value);
    }

    private static void printList(String[] items) {
        for (String item : items) {
            System.out.println(" - " + item);
        }
    }
}
