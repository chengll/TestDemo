package test.dmdfchina.com.databindingdemo;

import android.databinding.ObservableField;

/**
 * Created by mkt on 2017/12/28.
 */

public class TestDem0Bean {
    public ObservableField<String> userName=new ObservableField<>();
    public ObservableField<Integer>  userAge=new ObservableField<>();
    public TestDem0Bean(){
        userName.set("成玲玲");
        userAge.set(18);
    }
}
