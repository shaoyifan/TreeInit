public class Main {

    public static void main(String[] args) {

        DeptService deptService = new DeptService() ;
        Dept rootDept = deptService.getRootDept();
        System.out.print(rootDept);
    }
}

