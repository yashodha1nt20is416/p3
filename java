ckage com.example.yashodha;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.service.autofill.Validator;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
public class MainActivity extends AppCompatActivity implements OnClickListener {
 Button nine, eight, seven, plus, six, five, four, minus, three, two, one, multi, dot, zero, mode, div, equals, clear;
 EditText res;
 String operatorPresssed = "";
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 res = findViewById(R.id.res);
 nine = findViewById(R.id.nine);
 eight = findViewById(R.id.eight);
 seven = findViewById(R.id.seven);
 plus = findViewById(R.id.plus);
 six = findViewById(R.id.six);
 five = findViewById(R.id.five);
 four = findViewById(R.id.four);
 minus = findViewById(R.id.minus);
 three = findViewById(R.id.three);
 two = findViewById(R.id.two);
 one = findViewById(R.id.one);
 multi = findViewById(R.id.multi);
 dot = findViewById(R.id.dot);
 zero = findViewById(R.id.zero);
 mode = findViewById(R.id.mode);
 div = findViewById(R.id.div);
 equals = findViewById(R.id.equals);
 clear = findViewById(R.id.clear);
 nine.setOnClickListener(this);
 eight.setOnClickListener(this);
 seven.setOnClickListener(this);
 plus.setOnClickListener(this);
 six.setOnClickListener(this);
 five.setOnClickListener(this);
 four.setOnClickListener(this);
 minus.setOnClickListener(this);
 three.setOnClickListener(this);
 two.setOnClickListener(this);
 one.setOnClickListener(this);
 multi.setOnClickListener(this);
 dot.setOnClickListener(this);
 zero.setOnClickListener(this);
 mode.setOnClickListener(this);
 div.setOnClickListener(this);
 equals.setOnClickListener(this);
 clear.setOnClickListener(this);
 }
 @Override
 public void onClick(View view) {
 switch (view.getId()) {
 case R.id.nine:
 res.append("9");
 break;
 case R.id.eight:
 res.append("8");
 break;
 case R.id.seven:
 res.append("7");
 break;
 case R.id.plus:
 res.append("+");
 operatorPresssed = "+";
 break;
 case R.id.six:
 res.append("6");
 break;
 case R.id.five:
 res.append("5");
 break;
 case R.id.four:
 res.append("4");
 break;
 case R.id.minus:
 res.append("-");
 operatorPresssed = "-";
 break;
 case R.id.three:
 res.append("3");
 break;
 case R.id.two:
 res.append("2");
 break;
 case R.id.one:
 res.append("1");
 break;
 case R.id.multi:
 res.append("*");
 operatorPresssed = "*";
 break;
 case R.id.dot:
 res.append(".");
 operatorPresssed = ".";
 break;
 case R.id.zero:
 res.append("0");
 break;
 case R.id.mode:
 res.append("%");
 operatorPresssed = "%";
 break;
 case R.id.div:
 res.append("/");
 operatorPresssed = "/";
 break;
 case R.id.clear:
 res.setText("");
 break;
 case R.id.equals:
 double finalRes = compute(res.getText().toString(), operatorPresssed);
 res.setText(String.valueOf(finalRes));
 }
 }
 private double compute(String toString, String operatorPresssed) {
 String mArray[] = toString.split("\\+|-|\\*/\\/\\%");
 double op1 = Double.parseDouble(mArray[0]);
 double op2 = Double.parseDouble(mArray[1]);
 switch (operatorPresssed) {
 case "+":
 return op1 + op2;
 case "-":
 return op1 - op2;
 case "*":
 return op1 * op2;
 case "/":
 return op1 / op2;
 case "%":
 return op1 % op2;
 }
 return 0.0;
 }
}
