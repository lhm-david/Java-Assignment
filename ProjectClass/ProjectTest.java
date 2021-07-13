public class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project();
        System.out.println(project1.elevatorPitch());

        Project project2 = new Project("Java");
        System.out.println(project2.elevatorPitch());

        Project project3 = new Project("Python", "How to learn Python");
        System.out.println(project3.elevatorPitch());
        project3.setName("Mern");
        project3.setDesc("How to learn Mern");
        System.out.println(project3.getName());
        System.out.println(project3.getDesc());

    }
}