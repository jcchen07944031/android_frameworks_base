package android.app;

import android.content.Context;
import android.os.IEdgeSensorService;

public class EdgeSensorManager {
	IEdgeSensorService mService;
	
	public EdgeSensorManager(Context context, IEdgeSensorService service) {
		mService = service;
	}
}