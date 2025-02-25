//
//  SplashViewController.swift
//  Wordle
//
//  Created by Frederick Nguyen on 2/24/25.
//

import UIKit

class SplashViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()

        view.backgroundColor = UIColor.black // Set background color
        
        // Wordle Logo
        let logoImageView = UIImageView(image: UIImage(named: "wordle_logo"))
        logoImageView.contentMode = .scaleAspectFit
        logoImageView.translatesAutoresizingMaskIntoConstraints = false
        view.addSubview(logoImageView)

        // Wordle Title Label
        let titleLabel = UILabel()
        titleLabel.text = "WORDLE"
        titleLabel.font = UIFont.boldSystemFont(ofSize: 36)
        titleLabel.textColor = .white
        titleLabel.textAlignment = .center
        titleLabel.translatesAutoresizingMaskIntoConstraints = false
        view.addSubview(titleLabel)

        // Constraints
        NSLayoutConstraint.activate([
            logoImageView.centerXAnchor.constraint(equalTo: view.centerXAnchor),
            logoImageView.centerYAnchor.constraint(equalTo: view.centerYAnchor, constant: -50),
            logoImageView.widthAnchor.constraint(equalToConstant: 150),
            logoImageView.heightAnchor.constraint(equalToConstant: 150),

            titleLabel.topAnchor.constraint(equalTo: logoImageView.bottomAnchor, constant: 20),
            titleLabel.centerXAnchor.constraint(equalTo: view.centerXAnchor)
        ])

        // Animate transition to main screen
        DispatchQueue.main.asyncAfter(deadline: .now() + 2.0) {
            self.showMainScreen()
        }
    }

    private func showMainScreen() {
        let mainViewController = UIStoryboard(name: "Main", bundle: nil).instantiateInitialViewController()
        mainViewController?.modalTransitionStyle = .crossDissolve
        mainViewController?.modalPresentationStyle = .fullScreen
        if let mainVC = mainViewController {
            self.present(mainVC, animated: true, completion: nil)
        }
    }
}
