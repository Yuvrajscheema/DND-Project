public interface DnDCharacter {

    void longRest();
    void shortRest();

    void reduceHealth(int healthLoss);
    void addHealth(int health);
    void setHealth(int m_health);
    void getHealth();

    void useSorceryPoints(int number);
    void setSorceryPoints(int number);
    void getSorceryPoints();

    void useSpellSlot(int level, int number);
    void setSpellSlot(int level, int number);
    void getSpellSlots();

    void getInfo();
}
