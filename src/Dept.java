import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dept implements Comparable<Dept>{
	private Long deptId;
	private String deptName;
	private Long pid;
	private List<Dept> children;
	
	public Dept() {}
	public Dept(Long deptId,String deptName,Long pid){
		this.deptId = deptId;
		this.deptName = deptName;
		this.pid = pid;
	}
	
	public boolean isRoot(){
		return pid == null;
	}
	
	public boolean isLeaf(){
		return children == null || children.size() == 0;
	}
	
	
	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}
	
	public Long getPid() {
		return pid;
	}
	
	public void addChild(Dept child){
		if(children == null){
			children = new ArrayList<Dept>();
		}
		children.add(child);
	}
	
	//给所有的子部门进行排序
	public void sortChildren(){
		if(!isLeaf()){
			Collections.sort(children);//先给直接儿子进行排序
			for(Dept child : children){//然后遍历所有的儿子，给所有的儿子的儿子后背进行递归的排序
				child.sortChildren();
			}
		}
	}

	@Override
	public int compareTo(Dept o) {
		//这里写上dept之间排序的规则算法,我们规定的是dept越小的排序越高，等级也越高
		return (int)(o.deptId - this.deptId);
	}
	
}
