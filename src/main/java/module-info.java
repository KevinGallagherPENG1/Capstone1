module edu.miracostacollege.cs112.kgallagher.capstone {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens edu.miracostacollege.cs112.kgallagher.capstone to javafx.fxml;
    exports edu.miracostacollege.cs112.kgallagher.capstone;
}