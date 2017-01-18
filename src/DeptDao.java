import java.util.ArrayList;
import java.util.List;

public class DeptDao {

	private List<Dept> allDepts = new ArrayList<Dept>();
	{
		//模拟数据库记录
		allDepts.add(new Dept(1L, "总部", null));
		allDepts.add(new Dept(2L, "行政部", 1L));
		allDepts.add(new Dept(3L, "产品部", 1L));
		allDepts.add(new Dept(4L, "技术支持部", 1L));
		allDepts.add(new Dept(5L, "考勤办", 2L));
		allDepts.add(new Dept(6L, "接待办", 2L));
		allDepts.add(new Dept(7L, "会议办", 2L));
		allDepts.add(new Dept(8L, "产品调研分部", 3L));
		allDepts.add(new Dept(9L, "产品设计分部", 3L));
		allDepts.add(new Dept(10L, "产品评估分部", 3L));
		allDepts.add(new Dept(11L, "运维分部", 4L));
		allDepts.add(new Dept(11L, "开发分部", 4L));
	}
	
	public List<Dept> getAllDepts(){
		return allDepts;
	}
}
