	
	public  class JavaDep implements FaruqAcademy{
	
	public static void main(String[] args) {
		// static binding polymorphism
		JavaDep jDep = new JavaDep();
		jDep.deptName("jd");
		jDep.teacherInfo();
		
		// dynamic binding polymorphism
		FaruqAcademy jdAcademy = new JavaDep();
		System.out.println(jdAcademy.universityName);
		// can not create object out of interface.
		//FaruqAcademy fdAcademy = new FaruqAcademy();
	
	}
		@Override
		public void deptName(String deptName) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void teacherInfo() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void courseinfo() {
			// TODO Auto-generated method stub
			
		}
	
		
	
	}
