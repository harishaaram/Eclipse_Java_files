package introtocs.intermediate;

public class BaseballGame {
	private String team1; 
		private String team2;
		private static int totalGamesPlayed = 0;
		
		public BaseballGame(String team1, String team2){
			this.team1 = team1;
			this.team2 = team2;
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseballGame game1 = new BaseballGame("MU","ManC");
		BaseballGame game2 = new BaseballGame("RM","Liv");

		System.out.println(game1.getTeams());

		//System.out.println(game2.getTeams());
		System.out.println(BaseballGame.getTotalgamesplayed());
	}
	public String getTeams(){
		totalGamesPlayed++;
		return "THE GAME IS BETWEEN" + team1 + "VS" + team2;

	}
	public static int getTotalgamesplayed(){
		return totalGamesPlayed;
	}
}
