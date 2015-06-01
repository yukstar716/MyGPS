package com.example.yuki19920716.mygps;

import android.location.Location;
import android.os.Bundle;

/**
 * Created by yuki19920716 on 2015/04/14.
 */
public interface LocationListener {
    void onLocationChanged(Location location);

    void onStatusChanged(String provider, int status, Bundle extras);

    void onProviderEnabled(String provider);

    void onProviderDisabled(String provider);
}
