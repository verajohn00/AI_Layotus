package vera.moon.com.b1_layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public int var;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //another change...
        
        var = 0;
        
        var++;
        
        var--;
        
        //Add a coment
    }
}
