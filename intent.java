Intent intent=new Intent(Intent.ACTION_VIEW);  
intent.setData(Uri.parse("http://www.google.com")); 
startActivity(intent); 

 button1.setOnClickListener(new OnClickListener() {  
 public void onClick(View arg0) {  
            String url=editText1.getText().toString();  
		Intent intent=new Intent(Intent.ACTION_VIEW);  
                intent.setData(Uri.parse(url));  
                startActivity(intent);  
            }     }); 

//exp intent
et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        buttonSum = (Button) findViewById(R.id.button1);
buttonSum.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = et1.getText().toString();
                String value2 = et2.getText().toString();
                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int sum = a + b;
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);  
                i.putExtra("Value1",sum);  
                startActivity(i); 
//act2.class
Button button1=(Button)findViewById(R.id.button1);  
    button1.setOnClickListener(new OnClickListener(){  
        public void onClick(View view) {  
        int score= getIntent().getIntExtra("Value1",0);
       EditText text3 = (EditText) findViewById(R.id.editText1);
         text3.setText(String.valueOf(score));
          }  
    }); 
