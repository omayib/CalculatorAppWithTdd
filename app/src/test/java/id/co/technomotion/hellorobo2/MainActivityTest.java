package id.co.technomotion.hellorobo2;

import android.app.Activity;
import android.support.v4.BuildConfig;
import android.text.Layout;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowToast;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.robolectric.Shadows.shadowOf;

/**
 * Created by omayib on 3/11/15.
 */


@RunWith(RobolectricTestRunner.class)
@Config(emulateSdk = 19,manifest = "app/src/main/AndroidManifest.xml")//
public class MainActivityTest {
    private  Activity activity;
    private EditText input1,input2;
    private Button btnPlus,btnMinus,btnMultiply,btnDivide;
    private TextView output;

    @Ignore
    public void test1(){
        String a="akus";
        assertThat(a,is("aku"));
    }

//    @Test
    public void test2(){

    }

    @Before
    public void setup(){
        activity = Robolectric.setupActivity(MainActivity.class);
        input1= (EditText) activity.findViewById(R.id.first_input);
        input2= (EditText) activity.findViewById(R.id.second_input);
        output= (TextView) activity.findViewById(R.id.result_output);
        btnPlus= (Button) activity.findViewById(R.id.button_plus);
        btnMinus= (Button) activity.findViewById(R.id.button_minus);
        btnMultiply= (Button) activity.findViewById(R.id.button_multiply);
        btnDivide= (Button) activity.findViewById(R.id.button_divide);
    }

    @Test
    public void show_toast_when_two_input_was_empty(){
        btnPlus.performClick();
        assertThat("wajib diisi",is(ShadowToast.getTextOfLatestToast()));
    }
    @Test
    public void show_toast_when_first_input_was_empty(){
        input2.setText("3");
        btnPlus.performClick();
        assertThat("wajib diisi",is(ShadowToast.getTextOfLatestToast()));
    }
    @Test
    public void show_toast_when_second_input_was_empty(){
        input1.setText("3");
        btnPlus.performClick();
        assertThat("wajib diisi",is(ShadowToast.getTextOfLatestToast()));
    }
    @Test
    public void plus_button_clicked_should_show_result(){
        input1.setText("1");
        input2.setText("2");
        btnPlus.performClick();
        assertThat(output.getText().toString(),is("3.0"));
    }
    @Test
    public void minus_button_clicked_should_show_result(){
        input1.setText("7");
        input2.setText("1");
        btnMinus.performClick();
        assertThat(output.getText().toString(),is("6.0"));
    }
    @Test
    public void multply_button_clicked_should_show_result(){
        input1.setText("5");
        input2.setText("2");
        btnMultiply.performClick();
        assertThat(output.getText().toString(),is("10.0"));
    }
    @Test
    public void division_button_clicked_should_show_result(){
        input1.setText("8");
        input2.setText("2");
        btnDivide.performClick();
        assertThat(output.getText().toString(),is("4.0"));
    }




}
