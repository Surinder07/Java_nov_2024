package assignments.solution;

class DepartmentHead extends Professor {
    private String officeRoom;

    public DepartmentHead(String name, int age, String employeeId, String department, double salary, String officeRoom) {
        super(name, age, employeeId, department, salary);
        this.officeRoom = officeRoom;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Office Room: " + officeRoom);
    }
}
