Button crashButton = findViewById(R.id.crashButton);
crashButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        // Intentionally crash the app
        throw new RuntimeException("This is a crash");
    }
});
