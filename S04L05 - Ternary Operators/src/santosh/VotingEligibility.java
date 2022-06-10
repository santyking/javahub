package santosh;

public class VotingEligibility
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int age = 18;
		String adult = "Allowed to vote";
		String child = "Not allowed to vote";
		String voteResult = (age>=18)?adult:child;
		System.out.println(voteResult);
	}

}
