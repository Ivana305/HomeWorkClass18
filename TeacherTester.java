package HomeWorkClass18;

class TeacherTester {
    public static void main(String[] args) {


        MathTeacher mathT = new MathTeacher();
        mathT.teaching();
        mathT.age = 25;
        System.out.println(mathT.age);

        PianoTeacher pianoTeacher=new PianoTeacher();
        pianoTeacher.testing();
        System.out.println(pianoTeacher.isFemale=true);
        System.out.println(pianoTeacher.worksFullTime=false);

        ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
        chemistryTeacher.name="Ana";
        System.out.println(chemistryTeacher.name);
        chemistryTeacher.tutoring();




    }

}
