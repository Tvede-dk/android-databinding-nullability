package databinding.test.com.databinding_nullability;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import databinding.test.com.databinding_nullability.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        //THIS SHOULD NEVER BE NULL; A DATABINDED VIEW CANNOT CONTAIN NOTHING.
        // so "getRoot" should be annotated "NonNull". (and root as well in the databinding class).
        setContentView(binding.getRoot());

        //if any included layout would indeed be null the databinding class would crash due to it using it without any null checks.
        //Thus it should also be annotated "NonNull" (the conceptual thing is, if we cannot include a layout then what state are we really in ? an invalid one).
        LinearLayout l = binding.theincluded.myinnerid;



        //minor detail
        //the
        /*
            @Nullable
            private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
         */
        //should be annotated according to iff there are any includes; if then it should be "nonnull" otherwise it should be nullable.
        // and the same for
        /*
            @Nullable
            private static final android.util.SparseIntArray sViewsWithIds;
         */

    }
}
