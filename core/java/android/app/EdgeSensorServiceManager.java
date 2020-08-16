package android.app;
import android.os.RemoteException;
import android.annotation.SystemService;
import android.content.Context;
 
@SystemService(Context.EDGE_SENSOR_SERVICE)
public final class EdgeSensorServiceManager {
	private final IEdgeSensorServiceManager mService;
	private Context mContext;
	/**
	* @hide to prevent subclassing from outside of the framework
	*/
	EdgeSensorServiceManager(Context context, IEdgeSensorServiceManager service) {
		mContext = context;
		mService = service;
	}
}