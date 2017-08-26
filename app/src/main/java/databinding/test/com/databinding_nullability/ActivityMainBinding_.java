package databinding.test.com.databinding_nullability;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

@SuppressWarnings("unchecked")
public class ActivityMainBinding_ extends android.databinding.ViewDataBinding  {


    //WRONG, the generated static initializer would make this NonNull
    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    //WRONG, the generated static initializer would make this NonNull
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(3);
        sIncludes.setIncludes(0,
                new String[] {"to_be_included"},
                new int[] {1},
                new int[] {R.layout.to_be_included});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.someid, 2);
    }
    // views
    //WRONG, the constructor assigns this just like anything else, and more code (eg see invalidateAll), assumes this is never null.
    @Nullable
    private final databinding.test.com.databinding_nullability.databinding.ToBeIncludedBinding mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView01;
    @NonNull
    public final android.widget.TextView someid;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBinding_(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.mboundView0 = (databinding.test.com.databinding_nullability.databinding.ToBeIncludedBinding) bindings[1];
        setContainedBinding(this.mboundView0);
        this.mboundView01 = (android.widget.LinearLayout) bindings[0];
        this.mboundView01.setTag(null);
        this.someid = (android.widget.TextView) bindings[2];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
            mDirtyFlags = 0x1L;
        }
        mboundView0.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView0.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        return variableSet;
    }

    //TODO Missing annotation on "object" ?
    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        executeBindingsOn(mboundView0);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static databinding.test.com.databinding_nullability.databinding.ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static databinding.test.com.databinding_nullability.databinding.ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<databinding.test.com.databinding_nullability.databinding.ActivityMainBinding>inflate(inflater, databinding.test.com.databinding_nullability.R.layout.activity_main, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static databinding.test.com.databinding_nullability.databinding.ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static databinding.test.com.databinding_nullability.databinding.ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(databinding.test.com.databinding_nullability.R.layout.activity_main, null, false), bindingComponent);
    }
    @NonNull
    public static databinding.test.com.databinding_nullability.databinding.ActivityMainBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static databinding.test.com.databinding_nullability.databinding.ActivityMainBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new databinding.test.com.databinding_nullability.databinding.ActivityMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}