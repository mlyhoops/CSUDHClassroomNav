package com.example.mlyho.csudhclassroomnav;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.GeoPoint;

public class classrooms extends AppCompatActivity {
    LatLng latLng;
    GeoPoint SAC3135 = new GeoPoint(0, 0);
    GeoPoint SAC3136 = new GeoPoint(0, 0);
    GeoPoint SAC3141 = new GeoPoint(0, 0);
    GeoPoint SAC3142 = new GeoPoint(0, 0);
    GeoPoint SAC3148 = new GeoPoint(0, 0);
    GeoPoint SAC3149 = new GeoPoint(0, 0);
    GeoPoint SAC3152 = new GeoPoint(0, 0);
    GeoPoint SAC3162 = new GeoPoint(0, 0);
    GeoPoint SAC3165 = new GeoPoint(0, 0);

    GeoPoint NSM_B202 = new GeoPoint(0, 0);
    GeoPoint NSM_B204 = new GeoPoint(0, 0);
    GeoPoint NSM_B206 = new GeoPoint(0, 0);
    GeoPoint NSM_B208 = new GeoPoint(0, 0);
    GeoPoint NSM_B210 = new GeoPoint(0, 0);
    GeoPoint NSM_B212 = new GeoPoint(0, 0);
    GeoPoint NSM_B216 = new GeoPoint(0, 0);
    GeoPoint NSM_B218 = new GeoPoint(0, 0);
    GeoPoint NSM_B220 = new GeoPoint(0, 0);
    GeoPoint NSM_B224 = new GeoPoint(0, 0);
    GeoPoint NSM_B234 = new GeoPoint(0, 0);
    GeoPoint NSM_B242 = new GeoPoint(0, 0);
    GeoPoint NSM_B252 = new GeoPoint(0, 0);

    String SAC3135name = null;
    String SAC3136name = null;
    String SAC3141name = null;
    String SAC3142name = null;
    String SAC3148name = null;
    String SAC3149name = null;
    String SAC3152name = null;
    String SAC3162name = null;
    String SAC3165name = null;

    String NSMB202name = null;
    String NSMB204name = null;
    String NSMB206name = null;
    String NSMB208name = null;
    String NSMB210name = null;
    String NSMB212name = null;
    String NSMB216name = null;
    String NSMB218name = null;
    String NSMB220name = null;
    String NSMB224name = null;
    String NSMB234name = null;
    String NSMB242name = null;
    String NSMB252name = null;


    TextView SAC3135class;
    TextView SAC3136class;
    TextView SAC3141class;
    TextView SAC3142class;
    TextView SAC3148class;
    TextView SAC3149class;
    TextView SAC3152class;
    TextView SAC3162class;
    TextView SAC3165class;

    TextView NSMB202class;
    TextView NSMB204class;
    TextView NSMB206class;
    TextView NSMB208class;
    TextView NSMB210class;
    TextView NSMB212class;
    TextView NSMB216class;
    TextView NSMB218class;
    TextView NSMB220class;
    TextView NSMB224class;
    TextView NSMB234class;
    TextView NSMB242class;
    TextView NSMB252class;



    double latitude;
    double longitude;

    private static final String TAG = "classrooms";
    //private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private DocumentReference reference3135 = FirebaseFirestore.getInstance().document("SAC 3/SAC 3135");
    private DocumentReference reference3136 = FirebaseFirestore.getInstance().document("SAC 3/SAC 3136");
    private DocumentReference reference3141 = FirebaseFirestore.getInstance().document("SAC 3/SAC 3141");
    private DocumentReference reference3142 = FirebaseFirestore.getInstance().document("SAC 3/SAC 3142");
    private DocumentReference reference3148 = FirebaseFirestore.getInstance().document("SAC 3/SAC 3148");
    private DocumentReference reference3149 = FirebaseFirestore.getInstance().document("SAC 3/SAC 3149");
    private DocumentReference reference3152 = FirebaseFirestore.getInstance().document("SAC 3/SAC 3152");
    private DocumentReference reference3162 = FirebaseFirestore.getInstance().document("SAC 3/SAC 3162");
    private DocumentReference reference3165 = FirebaseFirestore.getInstance().document("SAC 3/SAC 3165");

    private DocumentReference referenceB202 = FirebaseFirestore.getInstance().document("NSM Main/NSM B202");
    private DocumentReference referenceB204 = FirebaseFirestore.getInstance().document("NSM Main/NSM B204");
    private DocumentReference referenceB206 = FirebaseFirestore.getInstance().document("NSM Main/NSM B206");
    private DocumentReference referenceB208 = FirebaseFirestore.getInstance().document("NSM Main/NSM B208");
    private DocumentReference referenceB210 = FirebaseFirestore.getInstance().document("NSM Main/NSM B210");
    private DocumentReference referenceB212 = FirebaseFirestore.getInstance().document("NSM Main/NSM B212");
    private DocumentReference referenceB216 = FirebaseFirestore.getInstance().document("NSM Main/NSM B216");
    private DocumentReference referenceB218 = FirebaseFirestore.getInstance().document("NSM Main/NSM B218");
    private DocumentReference referenceB220 = FirebaseFirestore.getInstance().document("NSM Main/NSM B220");
    private DocumentReference referenceB224 = FirebaseFirestore.getInstance().document("NSM Main/NSM B224");
    private DocumentReference referenceB234 = FirebaseFirestore.getInstance().document("NSM Main/NSM B234");
    private DocumentReference referenceB242 = FirebaseFirestore.getInstance().document("NSM Main/NSM B242");
    private DocumentReference referenceB252 = FirebaseFirestore.getInstance().document("NSM Main/NSM B252");




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classrooms);

        SAC3135class = findViewById(R.id.SAC3135);
        SAC3136class = findViewById(R.id.SAC3136);
        SAC3141class = findViewById(R.id.SAC3141);
        SAC3142class = findViewById(R.id.SAC3142);
        SAC3148class = findViewById(R.id.SAC3148);
        SAC3149class = findViewById(R.id.SAC3149);
        SAC3152class = findViewById(R.id.SAC3152);
        SAC3162class = findViewById(R.id.SAC3162);
        SAC3165class = findViewById(R.id.SAC3165);

        NSMB202class = findViewById(R.id.NSMB202);
        NSMB204class = findViewById(R.id.NSMB204);
        NSMB206class = findViewById(R.id.NSMB206);
        NSMB208class = findViewById(R.id.NSMB208);
        NSMB210class = findViewById(R.id.NSMB210);
        NSMB212class = findViewById(R.id.NSMB212);
        NSMB216class = findViewById(R.id.NSMB216);
        NSMB218class = findViewById(R.id.NSMB218);
        NSMB220class = findViewById(R.id.NSMB220);
        NSMB224class = findViewById(R.id.NSMB224);
        NSMB234class = findViewById(R.id.NSMB234);
        NSMB242class = findViewById(R.id.NSMB242);
        NSMB252class = findViewById(R.id.NSMB252);


        // Write a message to the database
        //reference = db.collection("Classes").document("SAC 3");
        reference3135.get().addOnSuccessListener(listen3135);
        reference3136.get().addOnSuccessListener(listen3136);
        reference3141.get().addOnSuccessListener(listen3141);
        reference3142.get().addOnSuccessListener(listen3142);
        reference3148.get().addOnSuccessListener(listen3148);
        reference3149.get().addOnSuccessListener(listen3149);
        reference3152.get().addOnSuccessListener(listen3152);
        reference3162.get().addOnSuccessListener(listen3162);
        reference3165.get().addOnSuccessListener(listen3165);

        referenceB202.get().addOnSuccessListener(listenB202);
        referenceB204.get().addOnSuccessListener(listenB204);
        referenceB206.get().addOnSuccessListener(listenB206);
        referenceB208.get().addOnSuccessListener(listenB208);
        referenceB210.get().addOnSuccessListener(listenB210);
        referenceB212.get().addOnSuccessListener(listenB212);
        referenceB216.get().addOnSuccessListener(listenB216);
        referenceB218.get().addOnSuccessListener(listenB218);
        referenceB220.get().addOnSuccessListener(listenB220);
        referenceB224.get().addOnSuccessListener(listenB224);
        referenceB234.get().addOnSuccessListener(listenB234);
        referenceB242.get().addOnSuccessListener(listenB242);
        referenceB252.get().addOnSuccessListener(listenB252);


        //db.collection("Classes").get().addOnSuccessListener(completeListener);

    }

    OnSuccessListener listen3135 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                SAC3135 = task.getGeoPoint("3135");
                SAC3135class.setText(task.getId());
                SAC3135name = task.getString("SAC 3135");
                Log.d(TAG, "NAME TESTING THIS OUT" + SAC3135name);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listen3136 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                SAC3136 = task.getGeoPoint("3136");
                SAC3136class.setText(task.getId());
                SAC3136name = task.getString("SAC 3136");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listen3141= new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                SAC3141 = task.getGeoPoint("3141");
                SAC3141class.setText(task.getId());
                SAC3141name = task.getString("SAC 3141");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listen3142 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                SAC3142 = task.getGeoPoint("3142");
                SAC3142class.setText(task.getId());
                SAC3142name = task.getString("SAC 3142");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listen3148 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                SAC3148 = task.getGeoPoint("3148");
                SAC3148class.setText(task.getId());
                SAC3148name = task.getString("SAC 3148");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listen3149 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                SAC3149 = task.getGeoPoint("3149");
                SAC3149class.setText(task.getId());
                SAC3149name = task.getString("SAC 3149");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listen3152 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                SAC3152 = task.getGeoPoint("3152");
                SAC3152class.setText(task.getId());
                SAC3152name = task.getString("SAC 3152");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listen3162 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                SAC3162 = task.getGeoPoint("3162");
                SAC3162class.setText(task.getId());
                SAC3162name = task.getString("SAC 3162");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listen3165 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                SAC3165 = task.getGeoPoint("3165");
                SAC3165class.setText(task.getId());
                SAC3165name = task.getString("SAC 3165");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listenB202 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                NSM_B202 = task.getGeoPoint("B202");
                NSMB202class.setText(task.getId());
                NSMB202name = task.getString("NSM B202");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listenB204 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                NSM_B204 = task.getGeoPoint("B204");
                NSMB204class.setText(task.getId());
                NSMB204name = task.getString("NSM B204");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listenB206 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                NSM_B206 = task.getGeoPoint("B206");
                NSMB206class.setText(task.getId());
                NSMB206name = task.getString("NSM B206");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listenB208 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                NSM_B208 = task.getGeoPoint("B208");
                NSMB208class.setText(task.getId());
                NSMB208name = task.getString("NSM B208");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listenB210 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                NSM_B210 = task.getGeoPoint("B210");
                NSMB210class.setText(task.getId());
                NSMB210name = task.getString("NSM B210");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listenB212 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                NSM_B212 = task.getGeoPoint("B212");
                NSMB212class.setText(task.getId());
                NSMB212name = task.getString("NSM B212");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listenB216 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                NSM_B216 = task.getGeoPoint("B216");
                NSMB216class.setText(task.getId());
                NSMB216name = task.getString("NSM B216");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listenB218 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                NSM_B218 = task.getGeoPoint("B218");
                NSMB218class.setText(task.getId());
                NSMB218name = task.getString("NSM B218");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listenB220 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                NSM_B220 = task.getGeoPoint("B220");
                NSMB220class.setText(task.getId());
                NSMB220name = task.getString("NSM B220");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listenB224 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                NSM_B224 = task.getGeoPoint("B224");
                NSMB224class.setText(task.getId());
                NSMB224name = task.getString("NSM B224");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listenB234 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                NSM_B234 = task.getGeoPoint("B234");
                NSMB234class.setText(task.getId());
                NSMB234name = task.getString("NSM B234");
                //Log.d(TAG, task.getId() + " => " + SAC3135);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listenB242 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                NSM_B242 = task.getGeoPoint("B242");
                NSMB242class.setText(task.getId());
                NSMB242name = task.getString("NSM B242");
                Log.d(TAG, "Testing first testing " + NSMB242name);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };
    OnSuccessListener listenB252 = new OnSuccessListener<DocumentSnapshot>() {
        @Override
        public void onSuccess(DocumentSnapshot task) {
            if (task.exists()) {
                NSM_B252 = task.getGeoPoint("B252");
                NSMB252class.setText(task.getId());
                NSMB252name = task.getString("NSM B252");
                Log.d(TAG, "TESTING FIRST TESTING FIRST " + NSMB252name);

            } else {
                Log.w(TAG, "Error getting documents.");
            }
        }
    };

    public void SAC_3135(View view) {
        Intent returnIntent = new Intent();
        latitude = SAC3135.getLatitude();
        longitude = SAC3135.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", SAC3135name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
    public void SAC_3136(View view) {
        Intent returnIntent = new Intent();
        latitude = SAC3136.getLatitude();
        longitude = SAC3136.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", SAC3136name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
    public void SAC_3141(View view) {
        Intent returnIntent = new Intent();
        latitude = SAC3141.getLatitude();
        longitude = SAC3141.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", SAC3141name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
    public void SAC_3142(View view) {
        Intent returnIntent = new Intent();
        latitude = SAC3142.getLatitude();
        longitude = SAC3142.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", SAC3142name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
    public void SAC_3148(View view) {
        Intent returnIntent = new Intent();
        latitude = SAC3148.getLatitude();
        longitude = SAC3148.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", SAC3148name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
    public void SAC_3149(View view) {
        Intent returnIntent = new Intent();
        latitude = SAC3149.getLatitude();
        longitude = SAC3149.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", SAC3148name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
    public void SAC_3152(View view) {
        Intent returnIntent = new Intent();
        latitude = SAC3152.getLatitude();
        longitude = SAC3152.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", SAC3152name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
    public void SAC_3162(View view) {
        Intent returnIntent = new Intent();
        latitude = SAC3162.getLatitude();
        longitude = SAC3162.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", SAC3162name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
    public void SAC_3165(View view) {
        Intent returnIntent = new Intent();
        latitude = SAC3165.getLatitude();
        longitude = SAC3165.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", SAC3165name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
    public void NSM_B202(View view) {
        Intent returnIntent = new Intent();
        latitude = NSM_B202.getLatitude();
        longitude = NSM_B204.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", NSMB202name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }public void NSM_B204(View view) {
        Intent returnIntent = new Intent();
        latitude = NSM_B204.getLatitude();
        longitude = NSM_B204.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", NSMB204name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }public void NSM_B206(View view) {
        Intent returnIntent = new Intent();
        latitude = NSM_B206.getLatitude();
        longitude = NSM_B206.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", NSMB206name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }public void NSM_B208(View view) {
        Intent returnIntent = new Intent();
        latitude = NSM_B208.getLatitude();
        longitude = NSM_B208.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", NSMB208name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }public void NSM_B210(View view) {
        Intent returnIntent = new Intent();
        latitude = NSM_B210.getLatitude();
        longitude = NSM_B210.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", NSMB210name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }public void NSM_B212(View view) {
        Intent returnIntent = new Intent();
        latitude = NSM_B212.getLatitude();
        longitude = NSM_B212.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", NSMB212name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }public void NSM_B216(View view) {
        Intent returnIntent = new Intent();
        latitude = NSM_B216.getLatitude();
        longitude = NSM_B216.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", NSMB216name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }public void NSM_B218(View view) {
        Intent returnIntent = new Intent();
        latitude = NSM_B218.getLatitude();
        longitude = NSM_B218.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", NSMB218name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }public void NSM_B220(View view) {
        Intent returnIntent = new Intent();
        latitude = NSM_B220.getLatitude();
        longitude = NSM_B220.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", NSMB220name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }public void NSM_B224(View view) {
        Intent returnIntent = new Intent();
        latitude = NSM_B224.getLatitude();
        longitude = NSM_B224.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", NSMB224name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }public void NSM_B234(View view) {
        Intent returnIntent = new Intent();
        latitude = NSM_B234.getLatitude();
        longitude = NSM_B234.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", NSMB234name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }public void NSM_B242(View view) {
        Intent returnIntent = new Intent();
        latitude = NSM_B242.getLatitude();
        longitude = NSM_B242.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", NSMB242name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }public void NSM_B252(View view) {
        Intent returnIntent = new Intent();
        latitude = NSM_B252.getLatitude();
        longitude = NSM_B252.getLongitude();
        latLng = new LatLng(latitude, longitude);
        returnIntent.putExtra("picked_point",latLng);
        returnIntent.putExtra("title", NSMB252name);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
}
