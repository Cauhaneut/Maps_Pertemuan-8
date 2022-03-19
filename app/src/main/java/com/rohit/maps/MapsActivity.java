package com.rohit.maps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.rohit.maps.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng kampung = new LatLng(-6.365521773543516, 106.24601271186383);
        mMap.addMarker(new MarkerOptions().position(kampung).title("maps kampung halaman"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kampung));

        LatLng kantor = new LatLng(-6.231322482883776,  106.72679939680599);
        mMap.addMarker(new MarkerOptions().position(kantor).title("maps kantor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kantor));

        LatLng unpam = new LatLng(-6.345972175147943, 106.69165561779744);
        mMap.addMarker(new MarkerOptions().position(unpam).title("maps kampus"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(unpam));



    }
}