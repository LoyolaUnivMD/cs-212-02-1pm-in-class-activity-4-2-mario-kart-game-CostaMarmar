public class MarioKartPlayer {
    private String playerName;
    private String characterName;
    private int speed;

    public MarioKartPlayer(String playerName, String characterName, int speed)
    {
        this.playerName = playerName;
        this.characterName = characterName;
        this.speed = speed;
    }

    public void DisplayInfo()
    {
        System.out.println("Player name: " + playerName +"\nCharacter name: " + characterName + "\nCharacter speed: " + speed);
    }

    public void Boost()
    {
        System.out.println("Boosting!");
        speed += 15;
        System.out.println("Boost Complete!\nNew Speed: " + speed);
    }
}
