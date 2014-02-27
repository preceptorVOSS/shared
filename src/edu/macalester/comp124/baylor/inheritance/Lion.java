package edu.macalester.comp124.baylor.inheritance;

public class Lion
	extends Feline
{
	public Lion()
	{
		super("Lion");
	}

	@Override
	public String giveMeat()
	{
		return "tears it apart";
	}

    @Override
    public String ride() {
        return "knocks you off";
    }
}
