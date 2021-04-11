import java.util.List;

public class Character {

    private static final int ITEM_LIMIT = 12;

    private String name;
    private String title;
    private Role role;

    private int hitPoints;
    private int adventurePoints;

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    private int armorClass;

    private Item[] inventory;
    private List<Skill> skills;

    public Character()
    {
        inventory = new Item[ITEM_LIMIT];
    }

}
