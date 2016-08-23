//STDUENT RECODRD

import Name;

class Student {
	public static final int FAILING = 0;
	public static final int MARGINAL = 1;
	public static final int PASSING = 2;
	
	Name myname;
	int score1;
	int score2;
	int score3;
	int avg;
	int status;
	
	public Student(Name stud_name, int s1, int s2, int s3 ){
		myname = stud_name;
		score1 = s1;
		score2 = s2;
		score3 = s3;
		
		avg = (s1 + s2 +s3)/3;
		if(avg >= 70)
			status = PASSING;
		else if(avg >= 60)
			status = MARGINAL;
		else
			status = FAILING;
		
	}
	public boolean equals1(int teststatus){
		return (teststatus == status);
	}
	
}
