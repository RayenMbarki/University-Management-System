class Exam {
    private String name,level ;
    private Course course;

    public Exam(String examName, String level,Course c) {
        name = examName;
        this.level = level;
        course=c;

    }

    public String getExamName() {
        return name;
    }

    public String level() {
        return level;
    }

    @Override
    public String toString() {
        return "Exam : examName = " + name + " done for " + level + "students " ;
    }

    public Course getCourse() {
        return course;
    }
}

