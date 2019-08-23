package CCMSDashBoard;

/**
 * Created by Meave Dregonhive on 20/02/2018.
 */
public class Validity extends Thread
{
    private long begin;
    private long elapsed;


    @Override
    public void run()
    {
        begin = System.currentTimeMillis();
        elapsed = System.currentTimeMillis() - begin;

        while(elapsed < 7000)
        {

            elapsed = System.currentTimeMillis() - begin;
        }





    }

    public long getElapsed()
    {
        return this.elapsed;
    }


}
