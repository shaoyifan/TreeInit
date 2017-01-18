import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeptTree {

	Map<Long, Dept> deptMap = new HashMap<Long,Dept>();

	public DeptTree(List<Dept> depts) {
		Collections.sort(depts);//必须要先排序，避免后面存map的时候，先存了子节点而父节点后存
		for(Dept dept : depts){
			deptMap.put(dept.getDeptId(), dept);
			if(!dept.isRoot()){
				Dept parent = deptMap.get(dept.getPid());
				parent.addChild(dept);
			}
		}
	}
	
	public Dept root(){
		return deptMap.get(0L);
	}
	
}
