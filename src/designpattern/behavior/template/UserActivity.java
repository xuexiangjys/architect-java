package designpattern.behavior.template;

public class UserActivity extends Activity {

	@Override
	protected void onCreate() {
		System.out.println("onCreate...");
	}

	@Override
	protected void onStart() {
		System.out.println("onStart...");
	}

	@Override
	protected void onResume() {
		System.out.println("onResume...");
	}

	@Override
	protected void onPause() {
		System.out.println("onPause...");
	}

	@Override
	protected void onStop() {
		System.out.println("onStop...");
	}

	@Override
	protected void onDestroy() {
		System.out.println("onDestroy...");
	}
}
