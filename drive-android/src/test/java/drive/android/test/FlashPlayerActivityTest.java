package drive.android.test;

import android.test.ActivityInstrumentationTestCase2;

import com.goodow.drive.android.activity.play.FlashPlayerActivity;

public class FlashPlayerActivityTest extends ActivityInstrumentationTestCase2<FlashPlayerActivity> {
	private FlashPlayerActivity activity;

	public FlashPlayerActivityTest() {
		super(FlashPlayerActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();

		activity = getActivity();
	}

	public void testABC() {
		assertEquals(false, activity == null);
	}
}
