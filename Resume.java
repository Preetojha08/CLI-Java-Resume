import java.util.List;
import java.util.Arrays;

public class Resume {

    static class Project {
        String name, role, tech, period;
        List<String> bullets;
        Project(String name, String role, String tech, String period, List<String> bullets) {
            this.name = name; this.role = role; this.tech = tech; this.period = period; this.bullets = bullets;
        }
    }

    public static void main(String[] args) {
        // Personal Info
        String name = "Preet Ojha";
        String address = "Toronto, ON";
        String phone = "+1 (437)-808-2062";
        String email = "developer.preetojha08@gmail.com";
        String linkedIn = "https://www.linkedin.com/in/developer-preet-ojha/";
        String portfolio = "https://preet-portfolio-remix.pages.dev/";

        // Summary (ASCII only)
        String summary = "Software Developer (Android | Java/Kotlin | Full-Stack | Cloud). "
                + "Post-Grad in Full Stack (Lambton, 2023-2025). Building reliable Android apps, "
                + "REST APIs, and cloud-backed web features with CI/CD. Seeking Winter 2025 Android/Software "
                + "Developer internship/co-op (open work permit) and full-time opportunities by 2025.";

        // Skills (ASCII only)
        String[] skills = {
            "Programming Languages: Java, Kotlin, C++, C, Python, JavaScript, TypeScript, PHP, C#, Swift, Ruby, Rust, Perl, Lua, MATLAB, Assembly (x86/ARM), Lisp, Shell Scripting (Bash), SQL, HTML, CSS",
            "Mobile Development: Android SDK, Android NDK, Jetpack Compose, Room Database, Retrofit, Responsive UI/UX Design, SQLite",
            "Web Development: ReactJS, Node.js, Express.js, Vite, Tailwind, .NET, PHP, REST APIs, Full-Stack Development",
            "Cloud Platforms: AWS, Google Cloud Platform (GCP), Microsoft Azure, Heroku",
            "DevOps & Tools: Docker, Kubernetes, GitHub Actions (CI/CD), Jenkins, Maven, Gradle, XAMPP, Git, GitHub, GitLab, Jira, Agile (Scrum, Kanban)",
            "Databases: MySQL, MongoDB, SQL Server, Room, Firebase Firestore, Oracle DB (basic)",
            "Frameworks & Libraries: Retrofit, ReactJS, Node.js, Spring Boot (learning), OpenGL (3D Visualization)",
            "Analytics & Data: Data Analytics, Debugging, Problem Solving, Group-By Queries (SQL)",
            "UI/UX & Design: Wireframing, Prototyping, Responsive Design, Technical Documentation",
            "Soft Skills: Communication, Teamwork, Proposal Writing, Technical Presentation, Leadership"
        };

        // Education
        String[] education = {
            "Postgraduate Diploma - Full Stack Software Development, Lambton College (Sept 2023 - Apr 2025) | GPA: 3.2/4.0",
            "B.Eng. - Computer Engineering, Gujarat Technological University (Aug 2019 - Jun 2022) | GPA: 3.4/4.0"
        };

        // Certifications (expanded; mark uncertain ones as In Progress)
        String[] certifications = {
            "Cambridge Certification Authority - Java Level 1",
            "Web Development Programming Foundations - Duke University (Coursera)",
            "Android App Development - Vanderbilt University (Coursera)",
            "Google Cloud Fundamentals: Core Infrastructure - Coursera (In Progress)",
            "AWS Cloud Practitioner Essentials - Coursera (In Progress)",
            "Kotlin Fundamentals for Android - Google/Android (In Progress)"
        };

        // Experience
        String[] experience = {
            "Store Manager & Sandwich Artist | Subway Sandwich, Eglinton, Canada (Sept 2023 - Present)",
            "Junior Software Developer | Cronic Technologies (Jan 2022 - Jun 2022)",
            "Junior Android Developer | Silverwing Technologies Pvt Ltd (Apr 2018 - Apr 2019)"
        };

        // Volunteer
        String[] volunteer = {
            "Food Distribution Volunteer | FRIENDS, Gujarat, India (Nov 2020 - Dec 2020)"
        };

        // Awards
        String[] awards = {
            "Google Android Study Jam Winner (2021)",
            "Best Technical Presentation - Gujarat Technological University (2022)"
        };

        // Projects (ASCII bullets with '*')
        List<Project> projects = Arrays.asList(
            new Project(
                "GTU Marks Calculator (Play Store)",
                "Android Developer",
                "Java, SQLite, Android SDK",
                "2021",
                Arrays.asList(
                    "Offline GPA/SPI/CPI/CGPA calculator used by Gujarat Tech University students.",
                    "Implemented SQLite persistence, input validation, and share/export of results.",
                    "5K+ installs and 4.8 avg rating."
                )
            ),
            new Project(
                "AI-Powered Expense Tracker",
                "Android Developer",
                "Kotlin, TensorFlow Lite, Firebase, Room",
                "2024",
                Arrays.asList(
                    "On-device receipt text classification with TFLite; secure sync with Firebase.",
                    "Room DB for offline-first ledger; charts for spend insights.",
                    "Reduced manual entry by ~30% via OCR and auto-categorization."
                )
            ),
            new Project(
                "Cloud Task Manager",
                "Full-Stack Developer",
                "React, Node.js, Express, MongoDB, AWS (EC2/S3), GitHub Actions",
                "2024",
                Arrays.asList(
                    "Built CRUD tasks, auth, and real-time status updates.",
                    "Deployed to AWS with CI/CD; caching and pagination improved performance.",
                    "Improved API latency ~30% under load."
                )
            ),
            new Project(
                "Subway Works Manager",
                "Android/Backend Developer",
                "Java/Kotlin, Retrofit, Room, REST API, MySQL",
                "2023-2024",
                Arrays.asList(
                    "Internal shift/slot management, attendance, and analytics.",
                    "Room for local caching; Retrofit for API sync; role-based access.",
                    "Reduced scheduling conflicts and manual errors."
                )
            ),
            new Project(
                "Catering App (Ordering Platform)",
                "Android Developer",
                "Java, Retrofit, PHP, MySQL, Animations",
                "2022",
                Arrays.asList(
                    "Menu browsing, cart/checkout, and inquiry handling.",
                    "Admin panel for managing orders and inventory.",
                    "Enhanced user experience with animations and responsive UI."
                )
            )
        );

        // Render
        printHeader("RESUME");
        printLine("Name", name);
        printLine("Address", address);
        printLine("Phone", phone);
        printLine("Email", email);
        printLine("LinkedIn", linkedIn);
        printLine("Portfolio", portfolio);

        printHeader("PROFESSIONAL SUMMARY");
        System.out.println(summary);

        printHeader("SKILLS");
        printList(skills);

        printHeader("EXPERIENCE");
        printList(experience);

        printHeader("PROJECTS");
        printProjects(projects);

        printHeader("EDUCATION");
        printList(education);

        printHeader("CERTIFICATIONS");
        printList(certifications);

        printHeader("AWARDS");
        printList(awards);

        printHeader("VOLUNTEER WORK");
        printList(volunteer);

        System.out.println();
    }

    // Helpers (ASCII headers and bullets)
    private static void printHeader(String title) {
        System.out.println();
        System.out.println("=== " + title + " ===");
    }
    private static void printLine(String label, String value) {
        System.out.println(label + ": " + value);
    }
    private static void printList(String[] items) {
        for (String item : items) System.out.println(" - " + item);
    }
    private static void printProjects(List<Project> projects) {
        int i = 1;
        for (Project p : projects) {
            System.out.println(i++ + ". " + p.name + " | " + p.role);
            System.out.println("    Tech: " + p.tech + " | Period: " + p.period);
            for (String b : p.bullets) System.out.println("    * " + b);
            System.out.print("");
        }
    }
}
