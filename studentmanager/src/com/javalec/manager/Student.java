package com.javalec.manager;

/* �л� �Ѹ� �Ѹ��� ���������� �����ϱ� ���� Ŭ���� */
public class Student {
	private String name;
	private int age;
	private int studentNum;
	private String major;
	// private ���� �ν��Ͻ� �������� ����ȭ.
	
	public Student(String name, int age, int studentNum, String major) {
		this.name = name;	//�� ��ü�� name(�Ķ����)�� name���� �����ȴ�.
		this.age = age;
		this.studentNum = studentNum;
		this.major = major;
	}
	
	public void updateInfo(int i, String info) {	//������Ʈ�� ���� �޼ҵ�
		switch (i) {
		case 1: 	//�̸� ����
			setName(info);
			break;
		case 2:		//���� ����
			setAge(Integer.parseInt(info));
			break;
		case 3:		//�й� ����
			setStudentNum(Integer.parseInt(info));
			break;
		case 4: 	//���� ����
			setMajor(info);
			break;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	

}