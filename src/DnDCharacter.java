public class DnDCharacter {


    private int health;
    private final int maxHealth;
    private int levelOneSpellSlots, levelTwoSpellSlots,levelThreeSpellSlots, levelFourSpellSlots, levelFiveSpellSlots, levelSixSpellSlots, levelSevenSpellSlots, levelEightSpellSlots, levelNineSpellSlotsTen;
    private final int maxLevelOneSpellSlots, maxLevelTwoSpellSlots,maxLevelThreeSpellSlots, maxLevelFourSpellSlots, maxLevelFiveSpellSlots;
    private int sorceryPoints;
    private final int maxSorceryPoints;
    DnDCharacter(int m_health, int m_SorceryPoints, int m_levelOneSpellSlots, int m_levelTwoSpellSlots, int m_levelThreeSpellSlots, int m_levelFourSpellSlots, int m_levelFiveSpellSlots) {
        this.maxHealth = m_health;
        this.health = this.maxHealth;

        this.maxSorceryPoints = m_SorceryPoints;
        this.sorceryPoints = m_SorceryPoints;

        this.maxLevelOneSpellSlots = m_levelOneSpellSlots;
        this.levelOneSpellSlots = m_levelOneSpellSlots;

        this.maxLevelTwoSpellSlots = m_levelTwoSpellSlots;
        this.levelTwoSpellSlots = m_levelTwoSpellSlots;

        this.maxLevelThreeSpellSlots = m_levelThreeSpellSlots;
        this.levelThreeSpellSlots = m_levelThreeSpellSlots;

        this.maxLevelFourSpellSlots = m_levelFourSpellSlots;
        this.levelFourSpellSlots = m_levelFourSpellSlots;

        this.maxLevelFiveSpellSlots = m_levelFiveSpellSlots;
        this.levelFiveSpellSlots = m_levelFiveSpellSlots;
    }

    public void longRest() {

        health = maxHealth;
        sorceryPoints = maxSorceryPoints;
        levelOneSpellSlots = maxLevelOneSpellSlots;
        levelTwoSpellSlots = maxLevelTwoSpellSlots;
        levelThreeSpellSlots = maxLevelThreeSpellSlots;
        levelFourSpellSlots = maxLevelFourSpellSlots;
        levelFiveSpellSlots = maxLevelFiveSpellSlots;

    }

    public void shortRest() {
        health = maxHealth;
    }

    public void reduceHealth(int healthLoss) {
        this.health -= healthLoss;
    }

    public void addHealth(int healthGain) {
        this.health += healthGain;
    }
    public void setHealth(int m_health) {
        this.health = m_health;
    }

    public void getHealth() {
        System.out.println("\nCurrent Health: " + health);
    }

    public void useSorceryPoints(int number) {
        this.sorceryPoints -= number;
    }

    public void setSorceryPoints(int number) {
        this.sorceryPoints = number;
    }

    public void getSorceryPoints() {
        System.out.println("\nCurrent Sorcery Points: " + sorceryPoints);
    }


    public void useSpellSlot(int level, int number) {
        switch (level) {
            case 1 -> {
            levelOneSpellSlots -= number;
            System.out.println("Used level 1 spell slot");
            }
            case 2 -> {
                levelTwoSpellSlots -= number;
                System.out.println("Used level 2 spell slot");
            }
            case 3 -> {
                levelThreeSpellSlots -= number;
                System.out.println("Used level 3 spell slot");
            }
            case 4 -> {
                levelFourSpellSlots -= number;
                System.out.println("Used level 4 spell slot");
            }
            case 5 -> {
                levelFiveSpellSlots -= number;
                System.out.println("Used level 5 spell slot");
            }
        }
    }

    public void setSpellSlot(int level, int number) {
        switch (level) {
            case 1 -> {
                levelOneSpellSlots = number;
            }
            case 2 -> {
                levelTwoSpellSlots = number;
            }
            case 3 -> {
                levelThreeSpellSlots = number;
            }
            case 4 -> {
                levelFourSpellSlots = number;
            }
            case 5 -> {
                levelFiveSpellSlots = number;
            }
        }
    }

    public void getSpellSlots() {
        System.out.println("\nLevel 1 spell slots: " + levelOneSpellSlots);
        System.out.println("Level 2 spell slots: " + levelTwoSpellSlots);
        System.out.println("Level 3 spell slots: " + levelThreeSpellSlots);
        System.out.println("Level 4 spell slots: " + levelFourSpellSlots);
        System.out.println("Level 5 spell slots: " + levelFiveSpellSlots);
    }
    public void getInfo() {

        getHealth();
        getSorceryPoints();
        getSpellSlots();
    }

}
