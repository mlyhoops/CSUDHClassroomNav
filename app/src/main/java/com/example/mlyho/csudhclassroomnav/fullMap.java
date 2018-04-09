package com.example.mlyho.csudhclassroomnav;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class fullMap extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private GroundOverlay gMap;
    LatLng CSUDH, WH, SBS, NSM, SAC, GYM, LIB, LSU, SCC, COE, LCH, EXT, THE, layover;
    float zoom = 16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_map);

        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    @Override
    public void onMapReady(GoogleMap map) {
        mMap = map;
        CSUDH = new LatLng(33.8630188, -118.2556282);
        WH = new LatLng(33.866388, -118.256833);
        SBS = new LatLng(33.864597, -118.254831);
        NSM = new LatLng(33.863883, -118.254837);
        SAC = new LatLng(33.862837, -118.254776);
        GYM = new LatLng(33.862606, -118.256232);
        LIB = new LatLng(33.863724, -118.255930);
        LSU = new LatLng(33.865190, -118.255930);
        SCC = new LatLng(33.866116, -118.254845);
        COE = new LatLng(33.865430, -118.254955);
        LCH = new LatLng(33.863883, -118.256967);
        EXT = new LatLng(33.865420, -118.259023);
        THE = new LatLng(33.865403, -118.256749);
        layover = new LatLng(33.864745, -118.208271);


        //mMap.addMarker(new MarkerOptions().position(home).title("California State University Dominguez Hills"));
        mMap.addMarker(new MarkerOptions().position(WH).title("Welch Hall"));
        mMap.addMarker(new MarkerOptions().position(SBS).title("Social and Behavioral Sciences"));
        mMap.addMarker(new MarkerOptions().position(NSM).title("Natural Sciences and Mathematics"));
        mMap.addMarker(new MarkerOptions().position(SAC).title("South Academic Complex"));
        mMap.addMarker(new MarkerOptions().position(GYM).title("Gymnasium"));
        mMap.addMarker(new MarkerOptions().position(LIB).title("Library"));
        mMap.addMarker(new MarkerOptions().position(LSU).title("Loker Student Union"));
        mMap.addMarker(new MarkerOptions().position(SCC).title("Small College Complex"));
        mMap.addMarker(new MarkerOptions().position(COE).title("College of Education"));
        mMap.addMarker(new MarkerOptions().position(LCH).title("Lacorte Hall"));
        mMap.addMarker(new MarkerOptions().position(EXT).title("Extended Education"));
        mMap.addMarker(new MarkerOptions().position(THE).title("Theater"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CSUDH, zoom));
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        enableMyLocation();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.google_map_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Change the map type based on the user's selection.
        switch (item.getItemId()) {
            case R.id.normal_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case R.id.hybrid_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                return true;
            case R.id.satellite_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                return true;
            case R.id.terrain_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    private void enableMyLocation() {
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        } else {
            ActivityCompat.requestPermissions(this, new String[]
                            {Manifest.permission.ACCESS_FINE_LOCATION},
                    1);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        // Check if location permissions are granted and if so enable the
        // location data layer.
        switch (requestCode) {
            case 1:
                if (grantResults.length > 0
                        && grantResults[0]
                        == PackageManager.PERMISSION_GRANTED) {
                    enableMyLocation();
                    break;
                }
        }
    }

}
