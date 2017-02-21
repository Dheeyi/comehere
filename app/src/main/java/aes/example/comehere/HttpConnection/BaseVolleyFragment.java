package aes.example.comehere.HttpConnection;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;

/**
 * Created by alex enrique on 19/2/2017.
 */

public class BaseVolleyFragment extends Fragment {
    private VolleySingleton volleySingleton;
    private RequestQueue requestQueue;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        volleySingleton = VolleySingleton.getInstance(getActivity().getApplicationContext());
        requestQueue = volleySingleton.getRequestQueue();
    }

    @Override
    public void onStop() {
        super.onStop();
        if (requestQueue != null) {
            requestQueue.cancelAll(this);
        }
    }

    /**
     * Add new connection
     * @param request
     */
    public void addToQueue(Request request) {
        if (request != null) {
            request.setTag(this);
            if (request == null) {
                requestQueue = volleySingleton.getRequestQueue();
            }
            request.setRetryPolicy(new DefaultRetryPolicy(
                    60000, 3, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
            ));
            requestQueue.add(request);
        }
    }
}
