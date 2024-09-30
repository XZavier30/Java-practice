Class Coumter{
    private int clicks = 0;


    public void clicks(){
        ++this.clicks;
    }

    public int getClicks(){
        return this.clicks;
    }

    public void rest(){
        this.clicks = 0;
    }
}
