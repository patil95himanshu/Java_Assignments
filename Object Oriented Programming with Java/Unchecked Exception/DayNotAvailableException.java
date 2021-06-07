class DayNotAvailableException extends RuntimeException
{
    private String day;

    public DayNotAvailableException()
	{
        super();
    }

    public DayNotAvailableException(String message, String day)
	{
        super(message);
        this.day = day;
    }

    public DayNotAvailableException(String message, String day, Throwable cause)
	{
        super(message, cause);
        this.day = day;
    }

    @Override
    public String toString()
	{
        return super.toString();
    }

    @Override
    public String getMessage()
	{
        return super.getMessage() + " for the day :" + day;
    }

    @Override
    public String getLocalizedMessage()
	{
        return "The day "+day + " is not available.";
    }
}
