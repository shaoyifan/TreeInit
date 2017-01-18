import java.util.List;

public class DeptService {
	private DeptDao deptDao = new DeptDao();
	public Dept getRootDept(){
		List<Dept> allDepts = deptDao.getAllDepts();
		DeptTree deptTree = new DeptTree(allDepts);
		Dept root = deptTree.root();
		//如果你想显示的时候是按照规则排序显示的，那么你可以调用root.sortChildren()方法。
		return root;
	}
	
}
