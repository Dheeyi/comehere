package aes.example.comehere.HttpConnection;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by alex enrique on 19/2/2017.
 */

public class VolleySingleton {
    private static VolleySingleton singleton = null;
    private RequestQueue requestQueue;

    /**
     * Constructor VolleySingleton
     * @param context
     */
    public VolleySingleton(Context context) {
        requestQueue = Volley.newRequestQueue(context);
    }

    /**
     * Validate Instance
     * @param context
     * @return
     */
    public static VolleySingleton getInstance(Context context) {
        if (singleton == null) {
            singleton = new VolleySingleton(context);
        }
        return singleton;
    }

    /**
     * Get Request Queue
     * @return
     */
    public RequestQueue getRequestQueue() {
        return requestQueue;
    }
}
