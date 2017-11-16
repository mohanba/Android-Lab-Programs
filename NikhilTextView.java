package nmit.mohan.com.program1;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by mohan on 11/16/17.
 */

public class NikhilTextView extends TextView {


    public NikhilTextView(Context context) {
        super(context);
        init();
    }

    public NikhilTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    public NikhilTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();

    }

    public NikhilTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();

    }

    public void init(){
        Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), "Mywriting.ttf");
        setTypeface(myTypeface);
    }
}
