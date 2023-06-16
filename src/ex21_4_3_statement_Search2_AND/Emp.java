package ex21_4_3_statement_Search2_AND;

import java.sql.Date;

//DTO(Data Transfer Object) - 로직을 가지고 있지 않고 단순히 getters와 setters로 구성된 객체 입니다.
public class Emp {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;

	@Override
	public String toString() {
		return String.format("%-8s%-8s%-16s%s\t%-16s%s\t%s\t%s\t",
				empno, ename, job, mgr,
				hiredate, sal, comm, deptno);
	}

	// 이곳에서 마우스 오른쪽 버튼 클릭 -> Source -> Generate Getters and Setters
	// -> Select All

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

}
