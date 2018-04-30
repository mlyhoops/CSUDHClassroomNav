package com.example.mlyho.csudhclassroomnav;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.GeoPoint;

public class classrooms extends AppCompatActivity {
    LatLng latLng = new LatLng(33.86391012, -118.25442329);

    private static final String TAG = "classrooms";
    //private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private DocumentReference reference = FirebaseFirestore.getInstance().document("Classes/SAC 3");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classrooms);

        // Write a message to the database
        //reference = db.collection("Classes").document("SAC 3");
        reference.get().addOnSuccessListener(completeListener);
        //db.collection("Classes").get().addOnSuccessListener(completeListener);


    }

    OnSuccessListener completeListener = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                GeoPoint SAC3141 = task.getGeoPoint("SAC 3141");
                // Should return "latitude=33.86251757, longitude=-118.25466721"
                Log.d(TAG, task.getId() + " => " + SAC3141);
            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    public void NSM_B252(View view) {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("picked_point",latLng);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
}
