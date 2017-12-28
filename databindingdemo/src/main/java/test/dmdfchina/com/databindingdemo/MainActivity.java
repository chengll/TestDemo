package test.dmdfchina.com.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import test.dmdfchina.com.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserData userData=new UserData("玲玲宝贝","13");
        //由于在布局中设置了userInfo的字段，因此可以自动生成setUserInfo()的方法
        binding.setUserInfo(userData);

        TestDem0Bean testDem0Bean=new TestDem0Bean();
        binding.setTestUser(testDem0Bean);

    }
}
